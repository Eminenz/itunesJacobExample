/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class IITPlaylistWindow extends Dispatch {

	public static final String componentName = "iTunesLib.IITPlaylistWindow";

	public IITPlaylistWindow() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IITPlaylistWindow(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IITPlaylistWindow(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getName() {
		return Dispatch.get(this, "Name").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITWindowKind
	 */
	public ITWindowKind getKind() {
		return ITWindowKind.values()[Dispatch.get(this, "Kind").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getVisible() {
		return Dispatch.get(this, "Visible").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param visible an input-parameter of type boolean
	 */
	public void setVisible(boolean visible) {
		Dispatch.put(this, "Visible", new Variant(visible));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getResizable() {
		return Dispatch.get(this, "Resizable").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMinimized() {
		return Dispatch.get(this, "Minimized").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param minimized an input-parameter of type boolean
	 */
	public void setMinimized(boolean minimized) {
		Dispatch.put(this, "Minimized", new Variant(minimized));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMaximizable() {
		return Dispatch.get(this, "Maximizable").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMaximized() {
		return Dispatch.get(this, "Maximized").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param maximized an input-parameter of type boolean
	 */
	public void setMaximized(boolean maximized) {
		Dispatch.put(this, "Maximized", new Variant(maximized));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getZoomable() {
		return Dispatch.get(this, "Zoomable").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getZoomed() {
		return Dispatch.get(this, "Zoomed").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param zoomed an input-parameter of type boolean
	 */
	public void setZoomed(boolean zoomed) {
		Dispatch.put(this, "Zoomed", new Variant(zoomed));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTop() {
		return Dispatch.get(this, "Top").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param top an input-parameter of type int
	 */
	public void setTop(int top) {
		Dispatch.put(this, "Top", new Variant(top));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLeft() {
		return Dispatch.get(this, "Left").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param left an input-parameter of type int
	 */
	public void setLeft(int left) {
		Dispatch.put(this, "Left", new Variant(left));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBottom() {
		return Dispatch.get(this, "Bottom").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bottom an input-parameter of type int
	 */
	public void setBottom(int bottom) {
		Dispatch.put(this, "Bottom", new Variant(bottom));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRight() {
		return Dispatch.get(this, "Right").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param right an input-parameter of type int
	 */
	public void setRight(int right) {
		Dispatch.put(this, "Right", new Variant(right));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getWidth() {
		return Dispatch.get(this, "Width").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type int
	 */
	public void setWidth(int width) {
		Dispatch.put(this, "Width", new Variant(width));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHeight() {
		return Dispatch.get(this, "Height").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param height an input-parameter of type int
	 */
	public void setHeight(int height) {
		Dispatch.put(this, "Height", new Variant(height));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITTrackCollection
	 */
	public IITTrackCollection getSelectedTracks() {
		return new IITTrackCollection(Dispatch.get(this, "SelectedTracks").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist getPlaylist() {
		return new IITPlaylist(Dispatch.get(this, "Playlist").toDispatch());
	}

}
