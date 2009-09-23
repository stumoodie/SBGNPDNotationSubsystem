package org.pathwayeditor.notations.sbgnpd.ndom.impl;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;

import org.pathwayeditor.notations.sbgnpd.ndom.ICompartmentNode;
import org.pathwayeditor.notations.sbgnpd.ndom.IComplexNode;
import org.pathwayeditor.notations.sbgnpd.ndom.IEntityPoolNode;
import org.pathwayeditor.notations.sbgnpd.ndom.IMacromoleculeNode;
import org.pathwayeditor.notations.sbgnpd.ndom.IMapDiagram;
import org.pathwayeditor.notations.sbgnpd.ndom.INucleicAcidFeatureNode;
import org.pathwayeditor.notations.sbgnpd.ndom.IPdElementVisitor;
import org.pathwayeditor.notations.sbgnpd.ndom.IPerturbationNode;
import org.pathwayeditor.notations.sbgnpd.ndom.ISimpleChemicalNode;
import org.pathwayeditor.notations.sbgnpd.ndom.ISinkNode;
import org.pathwayeditor.notations.sbgnpd.ndom.ISourceNode;
import org.pathwayeditor.notations.sbgnpd.ndom.IUnitOfInformation;
import org.pathwayeditor.notations.sbgnpd.ndom.IUnspecifiedEntityNode;

public abstract class AbstractCompartmentNode extends PdElement implements ICompartmentNode {
	private static final String SBO_TERM = "SBO:0000999";
	private final String name;
	private final IMapDiagram map;
	private final EpnContainer epnContainerDelegatee;
	private final UnitOfInformationHandler uoiHandler;
	private BigDecimal volume = BigDecimal.ZERO;
	
	protected AbstractCompartmentNode(int identifier, IMapDiagram map, String name) {
		super(identifier, SBO_TERM);
		this.name = name;
		this.map = map;
		this.epnContainerDelegatee = new EpnContainer(this, this);
		this.uoiHandler = new UnitOfInformationHandler(this);
	}

	public String getName() {
		return this.name;
	}

	public Set<IUnitOfInformation> getUnitsOfInformation() {
		return this.uoiHandler.getUnitsOfInformation();
	}

	public IUnitOfInformation createUnitOfInformation(int identifier,
			String value) {
		return uoiHandler.createUnitOfInformation(identifier, value);
	}

	public boolean containsEntityPoolNode(int identifier) {
		return epnContainerDelegatee.containsEntityPoolNode(identifier);
	}

	public IComplexNode createComplexNode(int identifier) {
		return epnContainerDelegatee.createComplexNode(identifier);
	}

	public IMacromoleculeNode createMacromoleculeNode(int identifier, String name) {
		return epnContainerDelegatee.createMacromoleculeNode(identifier, name);
	}

	public INucleicAcidFeatureNode createNucleicAcidFeatureNode(int identifier, String name) {
		return epnContainerDelegatee.createNucleicAcidFeatureNode(identifier, name);
	}

	public IPerturbationNode createPerturbationNode(int identifier, String name) {
		return epnContainerDelegatee.createPerturbationNode(identifier, name);
	}

	public ISimpleChemicalNode createSimpleChemicalNode(int identifier, String name) {
		return epnContainerDelegatee.createSimpleChemicalNode(identifier, name);
	}

	public ISinkNode createSinkNode(int identifier) {
		return epnContainerDelegatee.createSinkNode(identifier);
	}

	public ISourceNode createSourceNode(int identifier) {
		return epnContainerDelegatee.createSourceNode(identifier);
	}

	public IUnspecifiedEntityNode createUnspecifiedEntityNode(int identifier, String name) {
		return epnContainerDelegatee.createUnspecifiedEntityNode(identifier, name);
	}

	public IEntityPoolNode getEntityPoolNode(int identifier) {
		return epnContainerDelegatee.getEntityPoolNode(identifier);
	}

	public Iterator<IEntityPoolNode> nodeIterator() {
		return epnContainerDelegatee.nodeIterator();
	}

	public IMapDiagram getMapDiagram() {
		return this.map;
	}

	public final void visit(IPdElementVisitor visitor) {
		visitor.visitCompartment(this);
		this.epnContainerDelegatee.visit(visitor);
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
}
