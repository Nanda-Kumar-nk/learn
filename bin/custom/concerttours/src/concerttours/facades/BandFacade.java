package concerttours.facades;
import java.util.List;
import concerttours.data.BandData;
 
public interface BandFacade
{
 /**
    getBand with name
 **/
    BandData getBand(String name);
    List<BandData> getBands();
}
