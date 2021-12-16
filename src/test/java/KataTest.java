import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    /**
     * Simple fonction pour tester les commandes du gist
     */
    @Test
    void wizbaktoptest() {
        assertEquals(Wizbaktop.run(1), "1");
        assertEquals(Wizbaktop.run(2), "2");
        assertEquals(Wizbaktop.run(3), "WizWiz");
        assertEquals(Wizbaktop.run(5), "BakBak");
        assertEquals(Wizbaktop.run(6), "Wiz");
        assertEquals(Wizbaktop.run(15), "WizBakBak");
        assertEquals(Wizbaktop.run(33), "WizWizWiz");
        assertEquals(Wizbaktop.run(35), "BakTopWizBak");
        assertEquals(Wizbaktop.run(357), "WizTopWizBakTop");
        assertEquals(Wizbaktop.run(703), "Top*Wiz");
        assertEquals(Wizbaktop.run(13705), "BakWizTop*Bak");
    }

}
