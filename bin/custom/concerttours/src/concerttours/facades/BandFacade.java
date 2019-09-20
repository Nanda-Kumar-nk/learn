package concerttours.facades;
import java.util.List;
import concerttours.data.BandData;
 
public interface BandFacade
{
     /**
     * Returns tehh BandDTO against the name provided
     * @param name
     * @return
     */
    BandData getBand(String name);
    List<BandData> getBands();
}
