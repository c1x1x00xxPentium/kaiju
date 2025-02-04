/***
 * CERT Kaiju
 * Copyright 2021 Carnegie Mellon University.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING
 * INSTITUTE MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY
 * MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER
 * INCLUDING, BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR
 * MERCHANTABILITY, EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL.
 * CARNEGIE MELLON UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT
 * TO FREEDOM FROM PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under a BSD (SEI)-style license, please see LICENSE.md or contact permission@sei.cmu.edu for full terms.
 *
 * [DISTRIBUTION STATEMENT A] This material has been approved for public release and unlimited distribution.
 * Please see Copyright notice for non-US Government use and distribution.
 *
 * Carnegie Mellon (R) and CERT (R) are registered in the U.S. Patent and Trademark Office by Carnegie Mellon University.
 *
 * This Software includes and/or makes use of the following Third-Party Software subject to its own license:
 * 1. OpenJDK (http://openjdk.java.net/legal/gplv2+ce.html) Copyright 2021 Oracle.
 * 2. Ghidra (https://github.com/NationalSecurityAgency/ghidra/blob/master/LICENSE) Copyright 2021 National Security Administration.
 * 3. GSON (https://github.com/google/gson/blob/master/LICENSE) Copyright 2020 Google.
 * 4. JUnit (https://github.com/junit-team/junit5/blob/main/LICENSE.md) Copyright 2020 JUnit Team.
 *
 * DM21-0087
 */
package kaiju.fnhash;

import ghidra.program.model.address.Address;
import ghidra.program.model.address.AddressSetView;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;
import ghidra.program.model.listing.Program;
import ghidra.program.model.util.PropertyMapManager;
import ghidra.program.model.util.ObjectPropertyMap;
import ghidra.util.exception.DuplicateNameException;
import ghidra.util.exception.CancelledException;
import ghidra.util.exception.UsrException;
import ghidra.util.task.TaskMonitor;

// For UTF8 charset in crypto functions to standardize across operating systems
import java.nio.charset.StandardCharsets;

import java.util.StringJoiner;
import java.security.MessageDigest;

import kaiju.fnhash.internal.FnHashSaveable;
import kaiju.fnhash.internal.FnUtils;
import kaiju.util.HexUtils;
import kaiju.util.MultiLogger;
import kaiju.util.MultiLogLevel;

import kaiju.common.CodeUnitEdge;
import kaiju.common.CodeUnitVertex;
import kaiju.common.InsnControlFlowGraph;
import kaiju.common.InsnControlFlowGraphElement;
import kaiju.common.InsnControlFlowGraphElementVisitor;

public class HashingGraph implements InsnControlFlowGraphElementVisitor {

    /**
     * Takes a Program and then runs the hashing algorithms
     * on each Function.
     * Meant to sort of implement a Visitor pattern to allow
     * easy extensibility.
     */
    public HashingGraph(Program program, TaskMonitor monitor) {
    
        
    
    }
    
    @Override
    public void visit(CodeUnitEdge cuedge) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(CodeUnitVertex cuvertex) {
        System.out.println("Visiting car");
    }
    
    @Override
    public void visit(InsnControlFlowGraph cfg) {
        System.out.println("Visiting CFG");
    }

}


