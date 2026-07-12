package org.geysermc.mcprotocollib.protocol.data.game.inventory;

public enum FillStackAction implements ContainerAction {
    /**
     * Fills the carried stack, checking the container's slots in order.
     */
    FILL,
    /**
     * Fills the carried stack, checking the container's slots in reverse order.
     */
    FILL_REVERSED;

    public int getId() {
        return this.ordinal();
    }

    private static final FillStackAction[] VALUES = values();

    public static FillStackAction from(int id) {
        return VALUES[id];
    }
}
