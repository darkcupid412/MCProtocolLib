package org.geysermc.mcprotocollib.protocol.data;

import org.geysermc.mcprotocollib.protocol.data.game.inventory.ContainerActionType;
import org.geysermc.mcprotocollib.protocol.data.game.inventory.FillStackAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContainerActionTest {

    @Test
    public void fillStackActionHandlesBothButtons() {
        assertEquals(FillStackAction.FILL, ContainerActionType.FILL_STACK.actionFrom(0, 0));
        // The vanilla client only sends button 0, but the server accepts button 1 as well
        assertNotNull(ContainerActionType.FILL_STACK.actionFrom(1, 0));
    }
}
