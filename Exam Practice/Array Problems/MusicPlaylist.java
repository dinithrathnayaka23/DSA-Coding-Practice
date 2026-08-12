/*
2. Music Playlist — Insertion

A music application stores songs in the order in which they appear in a playlist.

[10, 25, 40, 55, 70]

Each number represents a song ID.

The user wants to insert a new song with ID 35 between song 25 and song 40.

Write a program to perform the insertion at the required position.

Your program should handle the shifting of elements and display the updated playlist.
*/

public class MusicPlaylist {
    public static void main(String[] args) {
        int music[]=new int[6];
        music[0]=10;
        music[1]=25;
        music[2]=40;
        music[3]=55;
        music[4]=70;
        int insertSong=35;
        int insertIndex=2;
        int size=5;
        for (int i =size;i>insertIndex;i--) {
            music[i]=music[i-1];
        }
        music[insertIndex]=insertSong;

        for (int i = 0; i < music.length; i++) {
            System.out.println(music[i]+" ");
        }
    }
}
