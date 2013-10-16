/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class IITPlaylist extends Dispatch {

	public static final String componentName = "iTunesLib.IITPlaylist";

	public IITPlaylist() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IITPlaylist(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IITPlaylist(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sourceID an input-parameter of type int
	 * @param playlistID an input-parameter of type int
	 * @param trackID an input-parameter of type int
	 * @param databaseID an input-parameter of type int
	 */
	public void getITObjectIDs(int sourceID, int playlistID, int trackID, int databaseID) {
		Dispatch.call(this, "GetITObjectIDs", new Variant(sourceID), new Variant(playlistID), new Variant(trackID), new Variant(databaseID));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param sourceID is an one-element array which sends the input-parameter
	 *                 to the ActiveX-Component and receives the output-parameter
	 * @param playlistID is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 * @param trackID is an one-element array which sends the input-parameter
	 *                to the ActiveX-Component and receives the output-parameter
	 * @param databaseID is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 */
	public void getITObjectIDs(int[] sourceID, int[] playlistID, int[] trackID, int[] databaseID) {
		Variant vnt_sourceID = new Variant();
		if( sourceID == null || sourceID.length == 0 )
			vnt_sourceID.putNoParam();
		else
			vnt_sourceID.putIntRef(sourceID[0]);

		Variant vnt_playlistID = new Variant();
		if( playlistID == null || playlistID.length == 0 )
			vnt_playlistID.putNoParam();
		else
			vnt_playlistID.putIntRef(playlistID[0]);

		Variant vnt_trackID = new Variant();
		if( trackID == null || trackID.length == 0 )
			vnt_trackID.putNoParam();
		else
			vnt_trackID.putIntRef(trackID[0]);

		Variant vnt_databaseID = new Variant();
		if( databaseID == null || databaseID.length == 0 )
			vnt_databaseID.putNoParam();
		else
			vnt_databaseID.putIntRef(databaseID[0]);

		Dispatch.call(this, "GetITObjectIDs", vnt_sourceID, vnt_playlistID, vnt_trackID, vnt_databaseID);

		if( sourceID != null && sourceID.length > 0 )
			sourceID[0] = vnt_sourceID.toInt();
		if( playlistID != null && playlistID.length > 0 )
			playlistID[0] = vnt_playlistID.toInt();
		if( trackID != null && trackID.length > 0 )
			trackID[0] = vnt_trackID.toInt();
		if( databaseID != null && databaseID.length > 0 )
			databaseID[0] = vnt_databaseID.toInt();
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
	 * @param name an input-parameter of type String
	 */
	public void setName(String name) {
		Dispatch.put(this, "Name", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getIndex() {
		return Dispatch.get(this, "Index").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getsourceID() {
		return Dispatch.get(this, "sourceID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getplaylistID() {
		return Dispatch.get(this, "playlistID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int gettrackID() {
		return Dispatch.get(this, "trackID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTrackDatabaseID() {
		return Dispatch.get(this, "TrackDatabaseID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void playFirstTrack() {
		Dispatch.call(this, "PlayFirstTrack");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showPrintDialog an input-parameter of type boolean
	 * @param printKind an input-parameter of type ITPlaylistPrintKind
	 * @param theme an input-parameter of type String
	 */
	public void print(boolean showPrintDialog, ITPlaylistPrintKind printKind, String theme) {
		Dispatch.call(this, "Print", new Variant(showPrintDialog), printKind, theme);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param searchText an input-parameter of type String
	 * @param searchFields an input-parameter of type ITPlaylistSearchField
	 * @return the result is of type IITTrackCollection
	 */
	public IITTrackCollection search(String searchText, ITPlaylistSearchField searchFields) {
		return new IITTrackCollection(Dispatch.call(this, "Search", searchText, searchFields).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITPlaylistKind
	 */
	public ITPlaylistKind getKind() {
		return ITPlaylistKind.values()[Dispatch.get(this, "Kind").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITSource
	 */
	public IITSource getSource() {
		return new IITSource(Dispatch.get(this, "Source").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDuration() {
		return Dispatch.get(this, "Duration").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShuffle() {
		return Dispatch.get(this, "Shuffle").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shuffle an input-parameter of type boolean
	 */
	public void setShuffle(boolean shuffle) {
		Dispatch.put(this, "Shuffle", new Variant(shuffle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getSize() {
		return Dispatch.get(this, "Size").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITPlaylistRepeatMode
	 */
	public ITPlaylistRepeatMode getSongRepeat() {
		return ITPlaylistRepeatMode.values()[Dispatch.get(this, "SongRepeat").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param songRepeat an input-parameter of type ITPlaylistRepeatMode
	 */
	public void setSongRepeat(ITPlaylistRepeatMode songRepeat) {
		Dispatch.put(this, "SongRepeat", songRepeat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTime() {
		return Dispatch.get(this, "Time").toString();
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
	 * @return the result is of type IITTrackCollection
	 */
	public IITTrackCollection getTracks() {
		return new IITTrackCollection(Dispatch.get(this, "Tracks").toDispatch());
	}

}
