/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class IiTunes extends Dispatch {

	public static final String componentName = "iTunesLib.IiTunes";

	public IiTunes() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IiTunes(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IiTunes(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void backTrack() {
		Dispatch.call(this, "BackTrack");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void fastForward() {
		Dispatch.call(this, "FastForward");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void nextTrack() {
		Dispatch.call(this, "NextTrack");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pause() {
		Dispatch.call(this, "Pause");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void play() {
		Dispatch.call(this, "Play");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param filePath an input-parameter of type String
	 */
	public void playFile(String filePath) {
		Dispatch.call(this, "PlayFile", filePath);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void playPause() {
		Dispatch.call(this, "PlayPause");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void previousTrack() {
		Dispatch.call(this, "PreviousTrack");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resume() {
		Dispatch.call(this, "Resume");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void rewind() {
		Dispatch.call(this, "Rewind");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void stop() {
		Dispatch.call(this, "Stop");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param filePath an input-parameter of type String
	 * @return the result is of type IITOperationStatus
	 */
	public IITOperationStatus convertFile(String filePath) {
		return new IITOperationStatus(Dispatch.call(this, "ConvertFile", filePath).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param filePaths an input-parameter of type Variant
	 * @return the result is of type IITOperationStatus
	 */
	public IITOperationStatus convertFiles(Variant filePaths) {
		return new IITOperationStatus(Dispatch.call(this, "ConvertFiles", filePaths).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iTrackToConvert an input-parameter of type Variant
	 * @return the result is of type IITOperationStatus
	 */
	public IITOperationStatus convertTrack(Variant iTrackToConvert) {
		return new IITOperationStatus(Dispatch.call(this, "ConvertTrack", iTrackToConvert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iTracksToConvert an input-parameter of type Variant
	 * @return the result is of type IITOperationStatus
	 */
	public IITOperationStatus convertTracks(Variant iTracksToConvert) {
		return new IITOperationStatus(Dispatch.call(this, "ConvertTracks", iTracksToConvert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param majorVersion an input-parameter of type int
	 * @param minorVersion an input-parameter of type int
	 * @return the result is of type boolean
	 */
	public boolean checkVersion(int majorVersion, int minorVersion) {
		return Dispatch.call(this, "CheckVersion", new Variant(majorVersion), new Variant(minorVersion)).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sourceID an input-parameter of type int
	 * @param playlistID an input-parameter of type int
	 * @param trackID an input-parameter of type int
	 * @param databaseID an input-parameter of type int
	 * @return the result is of type IITObject
	 */
	public IITObject getITObjectByID(int sourceID, int playlistID, int trackID, int databaseID) {
		return new IITObject(Dispatch.call(this, "GetITObjectByID", new Variant(sourceID), new Variant(playlistID), new Variant(trackID), new Variant(databaseID)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param playlistName an input-parameter of type String
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist createPlaylist(String playlistName) {
		return new IITPlaylist(Dispatch.call(this, "CreatePlaylist", playlistName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param uRL an input-parameter of type String
	 */
	public void openURL(String uRL) {
		Dispatch.call(this, "OpenURL", uRL);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void gotoMusicStoreHomePage() {
		Dispatch.call(this, "GotoMusicStoreHomePage");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void updateIPod() {
		Dispatch.call(this, "UpdateIPod");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numElems an input-parameter of type int
	 * @param data an input-parameter of type Variant
	 * @param names an input-parameter of type String
	 */
	public void authorize(int numElems, Variant data, String names) {
		Dispatch.call(this, "Authorize", new Variant(numElems), data, names);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void quit() {
		Dispatch.call(this, "Quit");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITSourceCollection
	 */
	public IITSourceCollection getSources() {
		return new IITSourceCollection(Dispatch.get(this, "Sources").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITEncoderCollection
	 */
	public IITEncoderCollection getEncoders() {
		return new IITEncoderCollection(Dispatch.get(this, "Encoders").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITEQPresetCollection
	 */
	public IITEQPresetCollection getEQPresets() {
		return new IITEQPresetCollection(Dispatch.get(this, "EQPresets").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITVisualCollection
	 */
	public IITVisualCollection getVisuals() {
		return new IITVisualCollection(Dispatch.get(this, "Visuals").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITWindowCollection
	 */
	public IITWindowCollection getWindows() {
		return new IITWindowCollection(Dispatch.get(this, "Windows").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSoundVolume() {
		return Dispatch.get(this, "SoundVolume").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param soundVolume an input-parameter of type int
	 */
	public void setSoundVolume(int soundVolume) {
		Dispatch.put(this, "SoundVolume", new Variant(soundVolume));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMute() {
		return Dispatch.get(this, "Mute").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mute an input-parameter of type boolean
	 */
	public void setMute(boolean mute) {
		Dispatch.put(this, "Mute", new Variant(mute));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITPlayerState
	 */
	public ITPlayerState getPlayerState() {
		return ITPlayerState.values()[Dispatch.get(this, "PlayerState").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPlayerPosition() {
		return Dispatch.get(this, "PlayerPosition").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param playerPosition an input-parameter of type int
	 */
	public void setPlayerPosition(int playerPosition) {
		Dispatch.put(this, "PlayerPosition", new Variant(playerPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITEncoder
	 */
	public IITEncoder getCurrentEncoder() {
		return new IITEncoder(Dispatch.get(this, "CurrentEncoder").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param currentEncoder an input-parameter of type IITEncoder
	 */
	public void setCurrentEncoder(IITEncoder currentEncoder) {
		Dispatch.put(this, "CurrentEncoder", currentEncoder);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getVisualsEnabled() {
		return Dispatch.get(this, "VisualsEnabled").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param visualsEnabled an input-parameter of type boolean
	 */
	public void setVisualsEnabled(boolean visualsEnabled) {
		Dispatch.put(this, "VisualsEnabled", new Variant(visualsEnabled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFullScreenVisuals() {
		return Dispatch.get(this, "FullScreenVisuals").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fullScreenVisuals an input-parameter of type boolean
	 */
	public void setFullScreenVisuals(boolean fullScreenVisuals) {
		Dispatch.put(this, "FullScreenVisuals", new Variant(fullScreenVisuals));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITVisualSize
	 */
	public ITVisualSize getVisualSize() {
		return ITVisualSize.values()[Dispatch.get(this, "VisualSize").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param visualSize an input-parameter of type ITVisualSize
	 */
	public void setVisualSize(ITVisualSize visualSize) {
		Dispatch.put(this, "VisualSize", visualSize);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITVisual
	 */
	public IITVisual getCurrentVisual() {
		return new IITVisual(Dispatch.get(this, "CurrentVisual").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param currentVisual an input-parameter of type IITVisual
	 */
	public void setCurrentVisual(IITVisual currentVisual) {
		Dispatch.put(this, "CurrentVisual", currentVisual);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEQEnabled() {
		return Dispatch.get(this, "EQEnabled").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param eQEnabled an input-parameter of type boolean
	 */
	public void setEQEnabled(boolean eQEnabled) {
		Dispatch.put(this, "EQEnabled", new Variant(eQEnabled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITEQPreset
	 */
	public IITEQPreset getCurrentEQPreset() {
		return new IITEQPreset(Dispatch.get(this, "CurrentEQPreset").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param currentEQPreset an input-parameter of type IITEQPreset
	 */
	public void setCurrentEQPreset(IITEQPreset currentEQPreset) {
		Dispatch.put(this, "CurrentEQPreset", currentEQPreset);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCurrentStreamTitle() {
		return Dispatch.get(this, "CurrentStreamTitle").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCurrentStreamURL() {
		return Dispatch.get(this, "CurrentStreamURL").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITBrowserWindow
	 */
	public IITBrowserWindow getBrowserWindow() {
		return new IITBrowserWindow(Dispatch.get(this, "BrowserWindow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITWindow
	 */
	public IITWindow getEQWindow() {
		return new IITWindow(Dispatch.get(this, "EQWindow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITSource
	 */
	public IITSource getLibrarySource() {
		return new IITSource(Dispatch.get(this, "LibrarySource").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITLibraryPlaylist
	 */
	public IITLibraryPlaylist getLibraryPlaylist() {
		return new IITLibraryPlaylist(Dispatch.get(this, "LibraryPlaylist").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITTrack
	 */
	public IITTrack getCurrentTrack() {
		return new IITTrack(Dispatch.get(this, "CurrentTrack").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist getCurrentPlaylist() {
		return new IITPlaylist(Dispatch.get(this, "CurrentPlaylist").toDispatch());
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
	 * @return the result is of type String
	 */
	public String getVersion() {
		return Dispatch.get(this, "Version").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param options an input-parameter of type int
	 */
	public void setOptions(int options) {
		Dispatch.call(this, "SetOptions", new Variant(options));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param filePath an input-parameter of type String
	 * @return the result is of type IITConvertOperationStatus
	 */
	public IITConvertOperationStatus convertFile2(String filePath) {
		return new IITConvertOperationStatus(Dispatch.call(this, "ConvertFile2", filePath).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param filePaths an input-parameter of type Variant
	 * @return the result is of type IITConvertOperationStatus
	 */
	public IITConvertOperationStatus convertFiles2(Variant filePaths) {
		return new IITConvertOperationStatus(Dispatch.call(this, "ConvertFiles2", filePaths).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iTrackToConvert an input-parameter of type Variant
	 * @return the result is of type IITConvertOperationStatus
	 */
	public IITConvertOperationStatus convertTrack2(Variant iTrackToConvert) {
		return new IITConvertOperationStatus(Dispatch.call(this, "ConvertTrack2", iTrackToConvert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iTracksToConvert an input-parameter of type Variant
	 * @return the result is of type IITConvertOperationStatus
	 */
	public IITConvertOperationStatus convertTracks2(Variant iTracksToConvert) {
		return new IITConvertOperationStatus(Dispatch.call(this, "ConvertTracks2", iTracksToConvert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAppCommandMessageProcessingEnabled() {
		return Dispatch.get(this, "AppCommandMessageProcessingEnabled").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param appCommandMessageProcessingEnabled an input-parameter of type boolean
	 */
	public void setAppCommandMessageProcessingEnabled(boolean appCommandMessageProcessingEnabled) {
		Dispatch.put(this, "AppCommandMessageProcessingEnabled", new Variant(appCommandMessageProcessingEnabled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getForceToForegroundOnDialog() {
		return Dispatch.get(this, "ForceToForegroundOnDialog").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param forceToForegroundOnDialog an input-parameter of type boolean
	 */
	public void setForceToForegroundOnDialog(boolean forceToForegroundOnDialog) {
		Dispatch.put(this, "ForceToForegroundOnDialog", new Variant(forceToForegroundOnDialog));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param eqPresetName an input-parameter of type String
	 * @return the result is of type IITEQPreset
	 */
	public IITEQPreset createEQPreset(String eqPresetName) {
		return new IITEQPreset(Dispatch.call(this, "CreateEQPreset", eqPresetName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param playlistName an input-parameter of type String
	 * @param iSource an input-parameter of type Variant
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist createPlaylistInSource(String playlistName, Variant iSource) {
		return new IITPlaylist(Dispatch.call(this, "CreatePlaylistInSource", playlistName, iSource).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param previousEnabled an input-parameter of type boolean
	 * @param playPauseStopState an input-parameter of type ITPlayButtonState
	 * @param nextEnabled an input-parameter of type boolean
	 */
	public void getPlayerButtonsState(boolean previousEnabled, ITPlayButtonState playPauseStopState, boolean nextEnabled) {
		Dispatch.call(this, "GetPlayerButtonsState", new Variant(previousEnabled), playPauseStopState, new Variant(nextEnabled));
	}

// FIXME: Does not compile
//	/**
//	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
//	 * @param previousEnabled is an one-element array which sends the input-parameter
//	 *                        to the ActiveX-Component and receives the output-parameter
//	 * @param playPauseStopState is an one-element array which sends the input-parameter
//	 *                           to the ActiveX-Component and receives the output-parameter
//	 * @param nextEnabled is an one-element array which sends the input-parameter
//	 *                    to the ActiveX-Component and receives the output-parameter
//	 */
//	public void getPlayerButtonsState(boolean[] previousEnabled, ITPlayButtonState[] playPauseStopState, boolean[] nextEnabled) {
//		Variant vnt_previousEnabled = new Variant();
//		if( previousEnabled == null || previousEnabled.length == 0 )
//			vnt_previousEnabled.putNoParam();
//		else
//			vnt_previousEnabled.putBooleanRef(previousEnabled[0]);
//
//		Variant vnt_playPauseStopState = new Variant();
//		if( playPauseStopState == null || playPauseStopState.length == 0 )
//			vnt_playPauseStopState.putNoParam();
//		else
//			vnt_playPauseStopState.putITPlayButtonStateRef(playPauseStopState[0]);
//
//		Variant vnt_nextEnabled = new Variant();
//		if( nextEnabled == null || nextEnabled.length == 0 )
//			vnt_nextEnabled.putNoParam();
//		else
//			vnt_nextEnabled.putBooleanRef(nextEnabled[0]);
//
//		Dispatch.call(this, "GetPlayerButtonsState", vnt_previousEnabled, vnt_playPauseStopState, vnt_nextEnabled);
//
//		if( previousEnabled != null && previousEnabled.length > 0 )
//			previousEnabled[0] = vnt_previousEnabled.toBoolean();
//		if( playPauseStopState != null && playPauseStopState.length > 0 )
//			playPauseStopState[0] = vnt_playPauseStopState.toITPlayButtonState();
//		if( nextEnabled != null && nextEnabled.length > 0 )
//			nextEnabled[0] = vnt_nextEnabled.toBoolean();
//	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param playerButton an input-parameter of type ITPlayerButton
	 * @param playerButtonModifierKeys an input-parameter of type int
	 */
	public void playerButtonClicked(ITPlayerButton playerButton, int playerButtonModifierKeys) {
		Dispatch.call(this, "PlayerButtonClicked", playerButton, new Variant(playerButtonModifierKeys));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iPlaylist an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean getCanSetShuffle(Variant iPlaylist) {
		return Dispatch.call(this, "CanSetShuffle", iPlaylist).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iPlaylist an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean getCanSetSongRepeat(Variant iPlaylist) {
		return Dispatch.call(this, "CanSetSongRepeat", iPlaylist).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITConvertOperationStatus
	 */
	public IITConvertOperationStatus getConvertOperationStatus() {
		return new IITConvertOperationStatus(Dispatch.get(this, "ConvertOperationStatus").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param uRL an input-parameter of type String
	 */
	public void subscribeToPodcast(String uRL) {
		Dispatch.call(this, "SubscribeToPodcast", uRL);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void updatePodcastFeeds() {
		Dispatch.call(this, "UpdatePodcastFeeds");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param folderName an input-parameter of type String
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist createFolder(String folderName) {
		return new IITPlaylist(Dispatch.call(this, "CreateFolder", folderName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param folderName an input-parameter of type String
	 * @param iSource an input-parameter of type Variant
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist createFolderInSource(String folderName, Variant iSource) {
		return new IITPlaylist(Dispatch.call(this, "CreateFolderInSource", folderName, iSource).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSoundVolumeControlEnabled() {
		return Dispatch.get(this, "SoundVolumeControlEnabled").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getLibraryXMLPath() {
		return Dispatch.get(this, "LibraryXMLPath").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iObject an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int getITObjectPersistentIDHigh(Variant iObject) {
		return Dispatch.call(this, "ITObjectPersistentIDHigh", iObject).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iObject an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int getITObjectPersistentIDLow(Variant iObject) {
		return Dispatch.call(this, "ITObjectPersistentIDLow", iObject).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iObject an input-parameter of type Variant
	 * @param highID an input-parameter of type int
	 * @param lowID an input-parameter of type int
	 */
	public void getITObjectPersistentIDs(Variant iObject, int highID, int lowID) {
		Dispatch.call(this, "GetITObjectPersistentIDs", iObject, new Variant(highID), new Variant(lowID));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param iObject an input-parameter of type Variant
	 * @param highID is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 * @param lowID is an one-element array which sends the input-parameter
	 *              to the ActiveX-Component and receives the output-parameter
	 */
	public void getITObjectPersistentIDs(Variant iObject, int[] highID, int[] lowID) {
		Variant vnt_highID = new Variant();
		if( highID == null || highID.length == 0 )
			vnt_highID.putNoParam();
		else
			vnt_highID.putIntRef(highID[0]);

		Variant vnt_lowID = new Variant();
		if( lowID == null || lowID.length == 0 )
			vnt_lowID.putNoParam();
		else
			vnt_lowID.putIntRef(lowID[0]);

		Dispatch.call(this, "GetITObjectPersistentIDs", iObject, vnt_highID, vnt_lowID);

		if( highID != null && highID.length > 0 )
			highID[0] = vnt_highID.toInt();
		if( lowID != null && lowID.length > 0 )
			lowID[0] = vnt_lowID.toInt();
	}

}
