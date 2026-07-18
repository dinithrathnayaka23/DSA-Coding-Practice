/*
Music Playlist

Each node stores:

Song Name
Artist
Duration

Operations:

Add song
Delete song
Display playlist
*/
class MusicNode{
    String songName;
    String artistName;
    double duration;
    MusicNode next;

    MusicNode(String songName,String artistName,double duration){
        this.songName=songName;
        this.artistName=artistName;
        this.duration=duration;
        this.next=null;
    }
}

class MusicApp{
    MusicNode head;
    void addSong(String songName,String artistName,double duration){
        MusicNode newSong=new MusicNode(songName, artistName, duration);
        if (head==null) {
            head=newSong;
            return;
        }
        MusicNode temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newSong;
    }
    void deleteSong(String songName){
        if (head==null) {
            System.out.println("List is empty!");
            return;
        }
        if(head.songName.equals(songName)){
            head=head.next;
            return;
        }
        MusicNode current=head;
        while (current.next!=null) {
            if (current.next.songName.equals(songName)) {
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }
    void displaySongList(){
        MusicNode b=head;
        System.out.println("Song List:");
        while (b!=null) {
            System.out.println(" Song Name: "+b.songName+" Artist Name: "+b.artistName+" Song Duration: "+b.duration);
            b=b.next;
        }
    }
}

public class Question08 {
    public static void main(String[]args){
        MusicApp obj=new MusicApp();
        obj.addSong("Perfect","Ed Sheeran", 3.50);
        obj.addSong("Love Story", "Taylor Swift", 4.25);
        obj.addSong("Baby", "Justin Bieber", 3.45);
        obj.displaySongList();
        obj.deleteSong("Baby");
        System.out.println();
        obj.displaySongList();
    }
}
