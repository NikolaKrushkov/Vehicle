//import org.testng.annotations.Test;

public class VehicleTest {

    @Test
    public void OperationalTest() {
        Vehicle operational = new Vehicle();
        assert false == operational.markAsNonOperational();
    }

    @Test
    public void isOperationalTest() {
        Vehicle isOperational = new Vehicle();
        assert false == isOperational.isOperational();
    }

    @Test
    public void markAsNonOperationalTest() {
        Vehicle markedAsNonOperational = new Vehicle();
        assert false == markedAsNonOperational.markAsNonOperational();
    }

    @Test
    public void NegativeMileageCheck() {
        Vehicle negativeMileage = new Vehicle();
        assert false == negativeMileage.getMileage() < 0;
    }

    @Test
    public void YearCheck() {
        Vehicle yearCheck = new Vehicle();
        int currentYear = java.time.Year.now().getValue();
        assert false == yearCheck.getYear() > currentYear;
    }

    @Test
    public void licensePlateCheck() {
        Vehicle licensePlate = new Vehicle();
        assert false == licensePlate.getLicensePlate().isEmpty();
    }

    @Test
    public void MileageUpdateCheck() {
        Vehicle mileageUpdate = new Vehicle();
        mileageUpdate.setMileage(5000);
        assert 5000 == mileageUpdate.getMileage();
    }

    @Test
    public void SamePlateCheck() {
        Vehicle samePlate = new Vehicle();
        Vehicle samePlate2 = new Vehicle();
        assert samePlate.getLicensePlate().equals(samePlate2.getLicensePlate());
    }

    @Test
    public void isOperationalMarkedAsNonOperationalCheck() {
        Vehicle isMarkedAsNon = new Vehicle();
        isMarkedAsNon.markAsNonOperational();
        assert false == isMarkedAsNon.isOperational();
    }
}
