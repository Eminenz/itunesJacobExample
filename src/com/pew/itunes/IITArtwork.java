/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class IITArtwork extends Dispatch {

	public static final String componentName = "iTunesLib.IITArtwork";

	public IITArtwork() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IITArtwork(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IITArtwork(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param filePath an input-parameter of type String
	 */
	public void setArtworkFromFile(String filePath) {
		Dispatch.call(this, "SetArtworkFromFile", filePath);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param filePath an input-parameter of type String
	 */
	public void saveArtworkToFile(String filePath) {
		Dispatch.call(this, "SaveArtworkToFile", filePath);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITArtworkFormat
	 */
	public ITArtworkFormat getFormat() {
		return ITArtworkFormat.values()[Dispatch.get(this, "Format").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsDownloadedArtwork() {
		return Dispatch.get(this, "IsDownloadedArtwork").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDescription() {
		return Dispatch.get(this, "Description").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param description an input-parameter of type String
	 */
	public void setDescription(String description) {
		Dispatch.put(this, "Description", description);
	}

}
