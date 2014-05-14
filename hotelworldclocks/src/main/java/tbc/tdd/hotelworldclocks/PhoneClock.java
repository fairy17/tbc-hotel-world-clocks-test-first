package tbc.tdd.hotelworldclocks;

/**
 * Created by benwu on 14-5-13.
 */
public class PhoneClock extends Clock {
    private HotelWorldClockSystem hotelWorldClockSystem;

    public PhoneClock(int utcOffset) {
            super.utcOffset = utcOffset;
    }

    public void setTime(int time) {
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - super.utcOffset);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }
}
