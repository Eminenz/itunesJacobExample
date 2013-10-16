/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class IITEQPreset extends Dispatch {

	public static final String componentName = "iTunesLib.IITEQPreset";

	public IITEQPreset() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IITEQPreset(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IITEQPreset(String compName) {
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
	 * @return the result is of type boolean
	 */
	public boolean getModifiable() {
		return Dispatch.get(this, "Modifiable").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getPreamp() {
		return Dispatch.get(this, "Preamp").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param preamp an input-parameter of type double
	 */
	public void setPreamp(double preamp) {
		Dispatch.put(this, "Preamp", new Variant(preamp));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand1() {
		return Dispatch.get(this, "Band1").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band1 an input-parameter of type double
	 */
	public void setBand1(double band1) {
		Dispatch.put(this, "Band1", new Variant(band1));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand2() {
		return Dispatch.get(this, "Band2").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band2 an input-parameter of type double
	 */
	public void setBand2(double band2) {
		Dispatch.put(this, "Band2", new Variant(band2));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand3() {
		return Dispatch.get(this, "Band3").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band3 an input-parameter of type double
	 */
	public void setBand3(double band3) {
		Dispatch.put(this, "Band3", new Variant(band3));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand4() {
		return Dispatch.get(this, "Band4").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band4 an input-parameter of type double
	 */
	public void setBand4(double band4) {
		Dispatch.put(this, "Band4", new Variant(band4));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand5() {
		return Dispatch.get(this, "Band5").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band5 an input-parameter of type double
	 */
	public void setBand5(double band5) {
		Dispatch.put(this, "Band5", new Variant(band5));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand6() {
		return Dispatch.get(this, "Band6").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band6 an input-parameter of type double
	 */
	public void setBand6(double band6) {
		Dispatch.put(this, "Band6", new Variant(band6));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand7() {
		return Dispatch.get(this, "Band7").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band7 an input-parameter of type double
	 */
	public void setBand7(double band7) {
		Dispatch.put(this, "Band7", new Variant(band7));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand8() {
		return Dispatch.get(this, "Band8").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band8 an input-parameter of type double
	 */
	public void setBand8(double band8) {
		Dispatch.put(this, "Band8", new Variant(band8));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand9() {
		return Dispatch.get(this, "Band9").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band9 an input-parameter of type double
	 */
	public void setBand9(double band9) {
		Dispatch.put(this, "Band9", new Variant(band9));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getBand10() {
		return Dispatch.get(this, "Band10").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param band10 an input-parameter of type double
	 */
	public void setBand10(double band10) {
		Dispatch.put(this, "Band10", new Variant(band10));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param updateAllTracks an input-parameter of type boolean
	 */
	public void delete(boolean updateAllTracks) {
		Dispatch.call(this, "Delete", new Variant(updateAllTracks));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newName an input-parameter of type String
	 * @param updateAllTracks an input-parameter of type boolean
	 */
	public void rename(String newName, boolean updateAllTracks) {
		Dispatch.call(this, "Rename", newName, new Variant(updateAllTracks));
	}

}
