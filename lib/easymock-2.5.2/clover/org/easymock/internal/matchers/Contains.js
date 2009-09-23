var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":2089,"methods":[{"el":30,"sc":5,"sl":28},{"el":35,"sc":5,"sl":32},{"el":39,"sc":5,"sl":37}],"name":"Contains","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_175":{"methods":[{"sl":28},{"sl":32}],"name":"andOverloaded","pass":true,"statements":[{"sl":29},{"sl":33}]},"test_224":{"methods":[{"sl":28},{"sl":32}],"name":"notOverloaded","pass":true,"statements":[{"sl":29},{"sl":33}]},"test_232":{"methods":[{"sl":28},{"sl":37}],"name":"containsToString","pass":true,"statements":[{"sl":29},{"sl":38}]},"test_274":{"methods":[{"sl":28},{"sl":37}],"name":"containsToString","pass":true,"statements":[{"sl":29},{"sl":38}]},"test_285":{"methods":[{"sl":28},{"sl":32}],"name":"notOverloaded","pass":true,"statements":[{"sl":29},{"sl":33}]},"test_315":{"methods":[{"sl":28},{"sl":32},{"sl":37}],"name":"constraints","pass":true,"statements":[{"sl":29},{"sl":33},{"sl":38}]},"test_629":{"methods":[{"sl":28},{"sl":32}],"name":"andOverloaded","pass":true,"statements":[{"sl":29},{"sl":33}]},"test_682":{"methods":[{"sl":28},{"sl":32}],"name":"testContains","pass":true,"statements":[{"sl":29},{"sl":33}]},"test_914":{"methods":[{"sl":28},{"sl":32}],"name":"testContains","pass":true,"statements":[{"sl":29},{"sl":33}]},"test_941":{"methods":[{"sl":28},{"sl":32},{"sl":37}],"name":"constraints","pass":true,"statements":[{"sl":29},{"sl":33},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [682, 285, 274, 914, 224, 175, 315, 941, 629, 232], [682, 285, 274, 914, 224, 175, 315, 941, 629, 232], [], [], [682, 285, 914, 224, 175, 315, 941, 629], [682, 285, 914, 224, 175, 315, 941, 629], [], [], [], [274, 315, 941, 232], [274, 315, 941, 232], [], []]