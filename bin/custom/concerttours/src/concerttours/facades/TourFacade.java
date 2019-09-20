package concerttours.facades;
import concerttours.data.TourData;
 
public interface TourFacade
{
     /**
     * get TourDetails Against the tourid
     * @param tourId
     * @return
     */
    TourData getTourDetails(final String tourId);
}
