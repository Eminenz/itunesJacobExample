/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class IITPlaylistCollection extends Dispatch {

	public static final String componentName = "iTunesLib.IITPlaylistCollection";

	public IITPlaylistCollection() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IITPlaylistCollection(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IITPlaylistCollection(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist getItem(int index) {
		return new IITPlaylist(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist getItemByName(String name) {
		return new IITPlaylist(Dispatch.call(this, "ItemByName", name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant get_NewEnum() {
		return Dispatch.get(this, "_NewEnum");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param highID an input-parameter of type int
	 * @param lowID an input-parameter of type int
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist getItemByPersistentID(int highID, int lowID) {
		return new IITPlaylist(Dispatch.call(this, "ItemByPersistentID", new Variant(highID), new Variant(lowID)).toDispatch());
	}

}
