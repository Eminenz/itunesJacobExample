/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class IITConvertOperationStatus extends Dispatch {

	public static final String componentName = "iTunesLib.IITConvertOperationStatus";

	public IITConvertOperationStatus() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IITConvertOperationStatus(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IITConvertOperationStatus(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getInProgress() {
		return Dispatch.get(this, "InProgress").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITTrackCollection
	 */
	public IITTrackCollection getTracks() {
		return new IITTrackCollection(Dispatch.get(this, "Tracks").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param trackName an input-parameter of type String
	 * @param progressValue an input-parameter of type int
	 * @param maxProgressValue an input-parameter of type int
	 */
	public void getConversionStatus(String trackName, int progressValue, int maxProgressValue) {
		Dispatch.call(this, "GetConversionStatus", trackName, new Variant(progressValue), new Variant(maxProgressValue));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param trackName is an one-element array which sends the input-parameter
	 *                  to the ActiveX-Component and receives the output-parameter
	 * @param progressValue is an one-element array which sends the input-parameter
	 *                      to the ActiveX-Component and receives the output-parameter
	 * @param maxProgressValue is an one-element array which sends the input-parameter
	 *                         to the ActiveX-Component and receives the output-parameter
	 */
	public void getConversionStatus(String[] trackName, int[] progressValue, int[] maxProgressValue) {
		Variant vnt_trackName = new Variant();
		if( trackName == null || trackName.length == 0 )
			vnt_trackName.putNoParam();
		else
			vnt_trackName.putStringRef(trackName[0]);

		Variant vnt_progressValue = new Variant();
		if( progressValue == null || progressValue.length == 0 )
			vnt_progressValue.putNoParam();
		else
			vnt_progressValue.putIntRef(progressValue[0]);

		Variant vnt_maxProgressValue = new Variant();
		if( maxProgressValue == null || maxProgressValue.length == 0 )
			vnt_maxProgressValue.putNoParam();
		else
			vnt_maxProgressValue.putIntRef(maxProgressValue[0]);

		Dispatch.call(this, "GetConversionStatus", vnt_trackName, vnt_progressValue, vnt_maxProgressValue);

		if( trackName != null && trackName.length > 0 )
			trackName[0] = vnt_trackName.toString();
		if( progressValue != null && progressValue.length > 0 )
			progressValue[0] = vnt_progressValue.toInt();
		if( maxProgressValue != null && maxProgressValue.length > 0 )
			maxProgressValue[0] = vnt_maxProgressValue.toInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void stopConversion() {
		Dispatch.call(this, "StopConversion");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String gettrackName() {
		return Dispatch.get(this, "trackName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getprogressValue() {
		return Dispatch.get(this, "progressValue").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getmaxProgressValue() {
		return Dispatch.get(this, "maxProgressValue").changeType(Variant.VariantInt).getInt();
	}

}
