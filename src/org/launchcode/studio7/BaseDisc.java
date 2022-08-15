package org.launchcode.studio7;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String discType;

    public BaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        this.name = aName;
        this.storageCapacity = maxCapacity;
        this.discType = aType;
        this.capacityUsed = checkUsedCapacity(someUsedCapacity);
        this.remainingCapacity = spaceLeft();
    }

    public int checkUsedCapacity(int someAmountOfData) {
        if (storageCapacity < someAmountOfData) {
            return storageCapacity;
        } else {
            return someAmountOfData;
        }
    }

    public int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String writeToDisc(int dataToWrite) {
        if (remainingCapacity < dataToWrite) {
            return "Not enough disc space.";
        } else {
            capacityUsed += dataToWrite;
            remainingCapacity -= dataToWrite;
            return "Data written to disc. Remaining disc capacity: " + remainingCapacity;
        }
    }

    public String discReport() {
        return "Name: " + this.name + "\n
    }

}
