package Hero;

public class Main {
    public static void main(String[] args) {

        Hero hero=new Hero("Krasi", 101);
        System.out.println(hero.toString());
        Elf elf =new Elf("Krasi", 101);
        System.out.println(elf.toString());
        Wizard wizard =new Wizard("Krasi", 101);
        System.out.println(wizard.toString());
        Knight knight=new Knight("Krasi", 101);
        System.out.println(knight.toString());
        MuseElf museElf=new MuseElf("Krasi", 101);
        System.out.println(museElf.toString());
        DarkWizard darkWizard =new DarkWizard("Krasi", 101);
        System.out.println(darkWizard.toString());
        DarkKnight darkKnight=new DarkKnight("Krasi", 101);
        System.out.println(darkKnight.toString());
        SoulMaster soulMaster=new SoulMaster("Krasi", 101);
        System.out.println(soulMaster.toString());
        BladeKnight bladeKnight = new BladeKnight("Krasi", 101);
        System.out.println(bladeKnight.toString());

    }
}
