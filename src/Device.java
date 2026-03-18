class Device {
    String name;
    boolean status;

    Device(String name) {
        this.name = name;
        this.status = false;
    }

    void toggle() {
        status = !status;
    }

    String getStatus() {
        return status ? "ON" : "OFF";
    }
}
