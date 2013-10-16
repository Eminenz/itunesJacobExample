/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.pew.itunes;

import com.jacob.com.*;

public class IITURLTrack extends Dispatch {

	public static final String componentName = "iTunesLib.IITURLTrack";

	public IITURLTrack() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IITURLTrack(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IITURLTrack(String compName) {
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
	public String getURL() {
		return Dispatch.get(this, "URL").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param uRL an input-parameter of type String
	 */
	public void setURL(String uRL) {
		Dispatch.put(this, "URL", uRL);
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
	 */
	public void downloadPodcastEpisode() {
		Dispatch.call(this, "DownloadPodcastEpisode");
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

}
