public class Cabriolet extends ElectricMotor {

    private static final String DEFAULT_ROOF_REMOVAL_TYPE = "Ручная";
    private static final String DEFAULT_ROOF_MATERIAL = "Бумага";
    private static final String DEFAULT_BODY_TYPE = "Тарга";

    private String roofRemovalType;
    private String roofMaterial;
    private String bodyType;

    public String getRoofRemovalType() {
        if (roofRemovalType != null) {
            this.roofRemovalType = roofRemovalType.isEmpty() ? DEFAULT_ROOF_REMOVAL_TYPE : roofRemovalType;
        } else {
            this.roofRemovalType = DEFAULT_ROOF_REMOVAL_TYPE;
        }
        return roofRemovalType;
    }

    public void setRoofRemovalType(String roofRemovalType) {
        if (roofRemovalType != null) {
            this.roofRemovalType = roofRemovalType.isEmpty() ? DEFAULT_ROOF_REMOVAL_TYPE : roofRemovalType;
        } else {
            this.roofRemovalType = DEFAULT_ROOF_REMOVAL_TYPE;
        }
    }

    public String getRoofMaterial() {
        if (roofMaterial != null) {
            this.roofMaterial = roofMaterial.isEmpty() ? DEFAULT_ROOF_MATERIAL : roofMaterial;
        } else {
            this.roofMaterial = DEFAULT_ROOF_MATERIAL;
        }
        return roofMaterial;
    }

    public void setRoofMaterial(String roofMaterial) {
        if (roofMaterial != null) {
            this.roofMaterial = roofMaterial.isEmpty() ? DEFAULT_ROOF_MATERIAL : roofMaterial;
        } else {
            this.roofMaterial = DEFAULT_ROOF_MATERIAL;
        }
    }

    public String getBodyType() {
        if (bodyType != null) {
            this.bodyType = bodyType.isEmpty() ? DEFAULT_BODY_TYPE : bodyType;
        } else {
            this.bodyType = DEFAULT_BODY_TYPE;
        }
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        if (bodyType != null) {
            this.bodyType = bodyType.isEmpty() ? DEFAULT_BODY_TYPE : bodyType;
        } else {
            this.bodyType = DEFAULT_BODY_TYPE;
        }
    }

    @Override
    public void printInfo(Car[] cars) {
        super.printInfo(cars);
        System.out.println("Тип кузова кабриолет - " + getBodyType());
        System.out.println("Материал съемной крыши - " + getRoofMaterial());
        System.out.println("Привод убирания крыши - " + getRoofRemovalType());
    }
}

