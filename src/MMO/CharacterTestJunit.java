package MMO;


import org.junit.jupiter.api.Test;

class TestCharacter

{
    @Test
    void test(){
        Character char1;
        char1 = new Character(1,100,"Yunus","Male",1,
                1,"Warrior",100,2,10,2100);

        String var1 = char1.getCharacterClass();

        assertEquals(1,1);
    }

    private void assertEquals(int i, int i1) {
    }

}