package com.pew.playlister;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.pew.itunes.IITPlaylist;
import com.pew.itunes.IITPlaylistCollection;
import com.pew.itunes.IITSource;
import com.pew.itunes.IITSourceCollection;
import com.pew.itunes.IiTunes;

public class Playlister {

	public static void main(String[] args) {
		System.out.println("Initing...");
		ComThread.InitMTA(true);
		System.out.println("Getting comp...");
		ActiveXComponent iTunesCom = new ActiveXComponent("iTunes.Application");
		Dispatch iTunesController = (Dispatch) iTunesCom.getObject();
		System.out.println("Instantiating...");
		IiTunes itunes = new IiTunes(iTunesController);
		System.out.println("You now have an Itunes...");
		
		IITSourceCollection sourceList = itunes.getSources();

		for (int i = 1; i <= sourceList.getCount(); i++) {
			IITSource s = sourceList.getItem(i);
			System.out.println("Source found:" + s.getName());
			IITPlaylistCollection lists = s.getPlaylists();
			for (int j = 1; j <= lists.getCount(); j++) {
				IITPlaylist pl = lists.getItem(j);
				System.out.println("Playlist found:" + pl.getName());
			}
		}
		// Dispatch.call(iTunesController, "PlayPause");
		ComThread.Release();
	}
}
