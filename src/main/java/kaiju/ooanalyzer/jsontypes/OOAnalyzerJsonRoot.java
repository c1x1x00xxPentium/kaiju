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
 
 
/**
 * The unamed top-level object that contains a list of structures
 *
 * @author jsg
 *
 */
package kaiju.ooanalyzer.jsontypes;

import java.util.Map;
import java.util.Collection;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import ghidra.util.Msg;

/**
 * This class is basically a wrapper to enable JSON loading through GSON
 */
public class OOAnalyzerJsonRoot {

  public static final String EXPECTED_JSON_VERSION = "2.2.0";

  @SerializedName("filemd5")
  @Expose
  private String md5;

  @SerializedName("filename")
  @Expose
  private String fname;

  @SerializedName("version")
  @Expose
  private String version;

  @SerializedName("structures")
  @Expose
  private Map<String, OOAnalyzerClassType> types;

  public Collection<OOAnalyzerClassType> getStructures() {
    if (!version.equals(EXPECTED_JSON_VERSION)) {
      Msg.warn(this, "Unable to locate allowSwingToProcessEvents. The GUI may be irresponsive.");
      throw new IllegalArgumentException(String.format("Expected JSON version '%s' but got '%s'", EXPECTED_JSON_VERSION, version));
    }
    return types.values ();
  }

  public String getFilename () {
    return fname;
  }

  public String getMd5 () {
    return md5;
  }
}
