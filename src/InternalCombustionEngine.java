public class InternalCombustionEngine extends Car {

    private static final int DEFAULT_FUEL_CAPACITY = 5;
    private static final String DEFAULT_ENGINE_TYPE = "Керосин";
    private static final String DEFAULT_CHARGE_SYSTEM = "Атмосферный";
    private static final String DEFAULT_EMISSION_STANDARD = "Euro 3";

    private int fuelCapacity;
    private String engineType;
    private String chargeSystem;
    private String emissionStandard;

    public int getFuelCapacity() {
        fuelCapacity = fuelCapacity > 0 ? fuelCapacity : DEFAULT_FUEL_CAPACITY;
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getEngineType() {
        if (engineType != null) {
            this.engineType = engineType.isEmpty() ? DEFAULT_ENGINE_TYPE : engineType;
        } else {
            this.engineType = DEFAULT_ENGINE_TYPE;
        }
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (engineType != null) {
            this.engineType = engineType.isEmpty() ? DEFAULT_ENGINE_TYPE : engineType;
        } else {
            this.engineType = DEFAULT_ENGINE_TYPE;
        }
    }

    public String getChargeSystem() {
        if (chargeSystem != null) {
            this.chargeSystem = chargeSystem.isEmpty() ? DEFAULT_CHARGE_SYSTEM : chargeSystem;
        } else {
            this.chargeSystem = DEFAULT_CHARGE_SYSTEM;
        }
        return chargeSystem;
    }

    public void setChargeSystem(String chargeSystem) {
        if (chargeSystem != null) {
            this.chargeSystem = chargeSystem.isEmpty() ? DEFAULT_CHARGE_SYSTEM : chargeSystem;
        } else {
            this.chargeSystem = DEFAULT_CHARGE_SYSTEM;
        }
    }

    public String getEmissionStandard() {
        if (emissionStandard != null) {
            this.emissionStandard = emissionStandard.isEmpty() ? DEFAULT_EMISSION_STANDARD : emissionStandard;
        } else {
            this.emissionStandard = DEFAULT_EMISSION_STANDARD;
        }
        return emissionStandard;
    }

    public void setEmissionStandard(String emissionStandard) {
        if (emissionStandard != null) {
            this.emissionStandard = emissionStandard.isEmpty() ? DEFAULT_EMISSION_STANDARD : emissionStandard;
        } else {
            this.emissionStandard = DEFAULT_EMISSION_STANDARD;
        }
    }

    @Override
    public void printInfo(Car[] cars) {
        super.printInfo(cars);
        System.out.println("Тип наддува - " + getChargeSystem());
        System.out.println("Тип двигателя - " + getEngineType());
        System.out.println("Экологический класс - " + getEmissionStandard());
        System.out.println("Размер бака в литрах - " + getFuelCapacity());
    }
}
