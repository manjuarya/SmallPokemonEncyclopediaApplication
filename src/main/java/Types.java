
class Types {
    int slot;
    Type type;

    public Types(int stot, Type type) {
        this.slot = stot;
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int stot) {
        this.slot = stot;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Types{" +
                "slot=" + slot +
                ", type=" + type +
                '}';
    }
}
