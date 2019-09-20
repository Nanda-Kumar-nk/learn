package concerttours.facades;

import concerttours.data.BandData;

import java.util.List;
 
public interface BandFacade
{
    /**
     * Returns tehh BandDTO against the name provided
     *
     * @param name
     * @return
     */
    BandData getBand(String name);
    List<BandData> getBands();
}
