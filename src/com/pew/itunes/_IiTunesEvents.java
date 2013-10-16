/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class _IiTunesEvents extends Dispatch {

	public static final String componentName = "iTunesLib._IiTunesEvents";

	public _IiTunesEvents() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public _IiTunesEvents(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public _IiTunesEvents(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param deletedObjectIDs an input-parameter of type Variant
	 * @param changedObjectIDs an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int onDatabaseChangedEvent(Variant deletedObjectIDs, Variant changedObjectIDs) {
		return Dispatch.call(this, "OnDatabaseChangedEvent", deletedObjectIDs, changedObjectIDs).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iTrack an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int onPlayerPlayEvent(Variant iTrack) {
		return Dispatch.call(this, "OnPlayerPlayEvent", iTrack).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iTrack an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int onPlayerStopEvent(Variant iTrack) {
		return Dispatch.call(this, "OnPlayerStopEvent", iTrack).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iTrack an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int onPlayerPlayingTrackChangedEvent(Variant iTrack) {
		return Dispatch.call(this, "OnPlayerPlayingTrackChangedEvent", iTrack).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int onUserInterfaceEnabledEvent() {
		return Dispatch.call(this, "OnUserInterfaceEnabledEvent").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param reason an input-parameter of type ITCOMDisabledReason
	 * @return the result is of type int
	 */
	public int onCOMCallsDisabledEvent(ITCOMDisabledReason reason) {
		return Dispatch.call(this, "OnCOMCallsDisabledEvent", reason).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int onCOMCallsEnabledEvent() {
		return Dispatch.call(this, "OnCOMCallsEnabledEvent").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int onQuittingEvent() {
		return Dispatch.call(this, "OnQuittingEvent").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int onAboutToPromptUserToQuitEvent() {
		return Dispatch.call(this, "OnAboutToPromptUserToQuitEvent").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newVolume an input-parameter of type int
	 * @return the result is of type int
	 */
	public int onSoundVolumeChangedEvent(int newVolume) {
		return Dispatch.call(this, "OnSoundVolumeChangedEvent", new Variant(newVolume)).changeType(Variant.VariantInt).getInt();
	}

}
