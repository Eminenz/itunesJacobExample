/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class IITFileOrCDTrack extends Dispatch {

	public static final String componentName = "iTunesLib.IITFileOrCDTrack";

	public IITFileOrCDTrack() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IITFileOrCDTrack(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IITFileOrCDTrack(String compName) {
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
	public void play() {
		Dispatch.call(this, "Play");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param filePath an input-parameter of type String
	 * @return the result is of type IITArtwork
	 */
	public IITArtwork addArtworkFromFile(String filePath) {
		return new IITArtwork(Dispatch.call(this, "AddArtworkFromFile", filePath).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITTrackKind
	 */
	public ITTrackKind getKind() {
		return ITTrackKind.values()[Dispatch.get(this, "Kind").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITPlaylist
	 */
	public IITPlaylist getPlaylist() {
		return new IITPlaylist(Dispatch.get(this, "Playlist").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getAlbum() {
		return Dispatch.get(this, "Album").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param album an input-parameter of type String
	 */
	public void setAlbum(String album) {
		Dispatch.put(this, "Album", album);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getArtist() {
		return Dispatch.get(this, "Artist").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param artist an input-parameter of type String
	 */
	public void setArtist(String artist) {
		Dispatch.put(this, "Artist", artist);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBitRate() {
		return Dispatch.get(this, "BitRate").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBPM() {
		return Dispatch.get(this, "BPM").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bPM an input-parameter of type int
	 */
	public void setBPM(int bPM) {
		Dispatch.put(this, "BPM", new Variant(bPM));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getComment() {
		return Dispatch.get(this, "Comment").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param comment an input-parameter of type String
	 */
	public void setComment(String comment) {
		Dispatch.put(this, "Comment", comment);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCompilation() {
		return Dispatch.get(this, "Compilation").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param compilation an input-parameter of type boolean
	 */
	public void setCompilation(boolean compilation) {
		Dispatch.put(this, "Compilation", new Variant(compilation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getComposer() {
		return Dispatch.get(this, "Composer").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param composer an input-parameter of type String
	 */
	public void setComposer(String composer) {
		Dispatch.put(this, "Composer", composer);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type java.util.Date
	 */
	public java.util.Date getDateAdded() {
		return Dispatch.get(this, "DateAdded").getJavaDate();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDiscCount() {
		return Dispatch.get(this, "DiscCount").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param discCount an input-parameter of type int
	 */
	public void setDiscCount(int discCount) {
		Dispatch.put(this, "DiscCount", new Variant(discCount));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDiscNumber() {
		return Dispatch.get(this, "DiscNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param discNumber an input-parameter of type int
	 */
	public void setDiscNumber(int discNumber) {
		Dispatch.put(this, "DiscNumber", new Variant(discNumber));
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
	public boolean getEnabled() {
		return Dispatch.get(this, "Enabled").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enabled an input-parameter of type boolean
	 */
	public void setEnabled(boolean enabled) {
		Dispatch.put(this, "Enabled", new Variant(enabled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getEQ() {
		return Dispatch.get(this, "EQ").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param eQ an input-parameter of type String
	 */
	public void setEQ(String eQ) {
		Dispatch.put(this, "EQ", eQ);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param finish an input-parameter of type int
	 */
	public void setFinish(int finish) {
		Dispatch.put(this, "Finish", new Variant(finish));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFinish() {
		return Dispatch.get(this, "Finish").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getGenre() {
		return Dispatch.get(this, "Genre").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param genre an input-parameter of type String
	 */
	public void setGenre(String genre) {
		Dispatch.put(this, "Genre", genre);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getGrouping() {
		return Dispatch.get(this, "Grouping").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param grouping an input-parameter of type String
	 */
	public void setGrouping(String grouping) {
		Dispatch.put(this, "Grouping", grouping);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getKindAsString() {
		return Dispatch.get(this, "KindAsString").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type java.util.Date
	 */
	public java.util.Date getModificationDate() {
		return Dispatch.get(this, "ModificationDate").getJavaDate();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPlayedCount() {
		return Dispatch.get(this, "PlayedCount").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param playedCount an input-parameter of type int
	 */
	public void setPlayedCount(int playedCount) {
		Dispatch.put(this, "PlayedCount", new Variant(playedCount));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type java.util.Date
	 */
	public java.util.Date getPlayedDate() {
		return Dispatch.get(this, "PlayedDate").getJavaDate();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param playedDate an input-parameter of type java.util.Date
	 */
	public void setPlayedDate(java.util.Date playedDate) {
		Dispatch.put(this, "PlayedDate", new Variant(playedDate));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPlayOrderIndex() {
		return Dispatch.get(this, "PlayOrderIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRating() {
		return Dispatch.get(this, "Rating").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rating an input-parameter of type int
	 */
	public void setRating(int rating) {
		Dispatch.put(this, "Rating", new Variant(rating));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSampleRate() {
		return Dispatch.get(this, "SampleRate").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSize() {
		return Dispatch.get(this, "Size").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStart() {
		return Dispatch.get(this, "Start").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param start an input-parameter of type int
	 */
	public void setStart(int start) {
		Dispatch.put(this, "Start", new Variant(start));
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
	 * @return the result is of type int
	 */
	public int getTrackCount() {
		return Dispatch.get(this, "TrackCount").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param trackCount an input-parameter of type int
	 */
	public void setTrackCount(int trackCount) {
		Dispatch.put(this, "TrackCount", new Variant(trackCount));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTrackNumber() {
		return Dispatch.get(this, "TrackNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param trackNumber an input-parameter of type int
	 */
	public void setTrackNumber(int trackNumber) {
		Dispatch.put(this, "TrackNumber", new Variant(trackNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getVolumeAdjustment() {
		return Dispatch.get(this, "VolumeAdjustment").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param volumeAdjustment an input-parameter of type int
	 */
	public void setVolumeAdjustment(int volumeAdjustment) {
		Dispatch.put(this, "VolumeAdjustment", new Variant(volumeAdjustment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getYear() {
		return Dispatch.get(this, "Year").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param year an input-parameter of type int
	 */
	public void setYear(int year) {
		Dispatch.put(this, "Year", new Variant(year));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITArtworkCollection
	 */
	public IITArtworkCollection getArtwork() {
		return new IITArtworkCollection(Dispatch.get(this, "Artwork").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getLocation() {
		return Dispatch.get(this, "Location").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void updateInfoFromFile() {
		Dispatch.call(this, "UpdateInfoFromFile");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPodcast() {
		return Dispatch.get(this, "Podcast").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void updatePodcastFeed() {
		Dispatch.call(this, "UpdatePodcastFeed");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRememberBookmark() {
		return Dispatch.get(this, "RememberBookmark").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rememberBookmark an input-parameter of type boolean
	 */
	public void setRememberBookmark(boolean rememberBookmark) {
		Dispatch.put(this, "RememberBookmark", new Variant(rememberBookmark));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getExcludeFromShuffle() {
		return Dispatch.get(this, "ExcludeFromShuffle").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeFromShuffle an input-parameter of type boolean
	 */
	public void setExcludeFromShuffle(boolean excludeFromShuffle) {
		Dispatch.put(this, "ExcludeFromShuffle", new Variant(excludeFromShuffle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getLyrics() {
		return Dispatch.get(this, "Lyrics").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lyrics an input-parameter of type String
	 */
	public void setLyrics(String lyrics) {
		Dispatch.put(this, "Lyrics", lyrics);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCategory() {
		return Dispatch.get(this, "Category").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param category an input-parameter of type String
	 */
	public void setCategory(String category) {
		Dispatch.put(this, "Category", category);
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

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getLongDescription() {
		return Dispatch.get(this, "LongDescription").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param longDescription an input-parameter of type String
	 */
	public void setLongDescription(String longDescription) {
		Dispatch.put(this, "LongDescription", longDescription);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBookmarkTime() {
		return Dispatch.get(this, "BookmarkTime").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bookmarkTime an input-parameter of type int
	 */
	public void setBookmarkTime(int bookmarkTime) {
		Dispatch.put(this, "BookmarkTime", new Variant(bookmarkTime));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITVideoKind
	 */
	public ITVideoKind getVideoKind() {
		return ITVideoKind.values()[Dispatch.get(this, "VideoKind").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param videoKind an input-parameter of type ITVideoKind
	 */
	public void setVideoKind(ITVideoKind videoKind) {
		Dispatch.put(this, "VideoKind", videoKind);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSkippedCount() {
		return Dispatch.get(this, "SkippedCount").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param skippedCount an input-parameter of type int
	 */
	public void setSkippedCount(int skippedCount) {
		Dispatch.put(this, "SkippedCount", new Variant(skippedCount));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type java.util.Date
	 */
	public java.util.Date getSkippedDate() {
		return Dispatch.get(this, "SkippedDate").getJavaDate();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param skippedDate an input-parameter of type java.util.Date
	 */
	public void setSkippedDate(java.util.Date skippedDate) {
		Dispatch.put(this, "SkippedDate", new Variant(skippedDate));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPartOfGaplessAlbum() {
		return Dispatch.get(this, "PartOfGaplessAlbum").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param partOfGaplessAlbum an input-parameter of type boolean
	 */
	public void setPartOfGaplessAlbum(boolean partOfGaplessAlbum) {
		Dispatch.put(this, "PartOfGaplessAlbum", new Variant(partOfGaplessAlbum));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getAlbumArtist() {
		return Dispatch.get(this, "AlbumArtist").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param albumArtist an input-parameter of type String
	 */
	public void setAlbumArtist(String albumArtist) {
		Dispatch.put(this, "AlbumArtist", albumArtist);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getShow() {
		return Dispatch.get(this, "Show").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param show an input-parameter of type String
	 */
	public void setShow(String show) {
		Dispatch.put(this, "Show", show);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSeasonNumber() {
		return Dispatch.get(this, "SeasonNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param seasonNumber an input-parameter of type int
	 */
	public void setSeasonNumber(int seasonNumber) {
		Dispatch.put(this, "SeasonNumber", new Variant(seasonNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getEpisodeID() {
		return Dispatch.get(this, "EpisodeID").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param episodeID an input-parameter of type String
	 */
	public void setEpisodeID(String episodeID) {
		Dispatch.put(this, "EpisodeID", episodeID);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEpisodeNumber() {
		return Dispatch.get(this, "EpisodeNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param episodeNumber an input-parameter of type int
	 */
	public void setEpisodeNumber(int episodeNumber) {
		Dispatch.put(this, "EpisodeNumber", new Variant(episodeNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSize64High() {
		return Dispatch.get(this, "Size64High").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSize64Low() {
		return Dispatch.get(this, "Size64Low").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getUnplayed() {
		return Dispatch.get(this, "Unplayed").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unplayed an input-parameter of type boolean
	 */
	public void setUnplayed(boolean unplayed) {
		Dispatch.put(this, "Unplayed", new Variant(unplayed));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSortAlbum() {
		return Dispatch.get(this, "SortAlbum").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortAlbum an input-parameter of type String
	 */
	public void setSortAlbum(String sortAlbum) {
		Dispatch.put(this, "SortAlbum", sortAlbum);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSortAlbumArtist() {
		return Dispatch.get(this, "SortAlbumArtist").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortAlbumArtist an input-parameter of type String
	 */
	public void setSortAlbumArtist(String sortAlbumArtist) {
		Dispatch.put(this, "SortAlbumArtist", sortAlbumArtist);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSortArtist() {
		return Dispatch.get(this, "SortArtist").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortArtist an input-parameter of type String
	 */
	public void setSortArtist(String sortArtist) {
		Dispatch.put(this, "SortArtist", sortArtist);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSortComposer() {
		return Dispatch.get(this, "SortComposer").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortComposer an input-parameter of type String
	 */
	public void setSortComposer(String sortComposer) {
		Dispatch.put(this, "SortComposer", sortComposer);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSortName() {
		return Dispatch.get(this, "SortName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortName an input-parameter of type String
	 */
	public void setSortName(String sortName) {
		Dispatch.put(this, "SortName", sortName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSortShow() {
		return Dispatch.get(this, "SortShow").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortShow an input-parameter of type String
	 */
	public void setSortShow(String sortShow) {
		Dispatch.put(this, "SortShow", sortShow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void reveal() {
		Dispatch.call(this, "Reveal");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAlbumRating() {
		return Dispatch.get(this, "AlbumRating").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param albumRating an input-parameter of type int
	 */
	public void setAlbumRating(int albumRating) {
		Dispatch.put(this, "AlbumRating", new Variant(albumRating));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITRatingKind
	 */
	public ITRatingKind getAlbumRatingKind() {
		return ITRatingKind.values()[Dispatch.get(this, "AlbumRatingKind").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ITRatingKind
	 */
	public ITRatingKind getratingKind() {
		return ITRatingKind.values()[Dispatch.get(this, "ratingKind").getInt()];
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IITPlaylistCollection
	 */
	public IITPlaylistCollection getPlaylists() {
		return new IITPlaylistCollection(Dispatch.get(this, "Playlists").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param location an input-parameter of type String
	 */
	public void setLocation(String location) {
		Dispatch.put(this, "Location", location);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type java.util.Date
	 */
	public java.util.Date getReleaseDate() {
		return Dispatch.get(this, "ReleaseDate").getJavaDate();
	}

}
