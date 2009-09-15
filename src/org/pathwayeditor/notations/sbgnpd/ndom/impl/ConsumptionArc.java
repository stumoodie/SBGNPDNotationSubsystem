package org.pathwayeditor.notations.sbgnpd.ndom.impl;

import org.pathwayeditor.businessobjects.drawingprimitives.ILinkEdge;
import org.pathwayeditor.notations.sbgnpd.ndom.IConsumptionArc;
import org.pathwayeditor.notations.sbgnpd.ndom.IEntityPoolNode;
import org.pathwayeditor.notations.sbgnpd.ndom.IPdElementVisitor;
import org.pathwayeditor.notations.sbgnpd.ndom.IProcessNode;

public class ConsumptionArc extends PdElement implements IConsumptionArc {
	private final static String SBO_TERM = "SBO:00999";
	private final IEntityPoolNode consumable;
	private final IProcessNode processNode;
	private int stoichiometry;
	
	
	public ConsumptionArc(ILinkEdge linkEdge, IEntityPoolNode consumeable,	IProcessNode processNode) {
		super(linkEdge.getAttribute().getCreationSerial(), SBO_TERM);
		this.consumable = consumeable;
		this.processNode = processNode;
	}

	public IEntityPoolNode getConsumableNode() {
		return this.consumable;
	}

	public IProcessNode getProcess() {
		return this.processNode;
	}

	public int getStoichiometry() {
		return stoichiometry;
	}

	public void setStoichiometry(int stoichiometry) {
		this.stoichiometry = stoichiometry;
	}

	public void visit(IPdElementVisitor visitor) {
		visitor.visitConsumptionArc(this);
	}

}