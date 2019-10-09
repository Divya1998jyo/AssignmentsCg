package polo;

public class CD extends WrittenItem{
	private String artist;
	private String genre;
	
	public boolean equals(Object obj){
	if(obj == null)
	return false;
	MediaItem otherMediaItem = (MediaItem) obj;
	int runTime = 0;
	return super.equals(otherMediaItem) && runTime == otherMediaItem.runTime;
	}
	

}
