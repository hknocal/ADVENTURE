abstract class RangedWeapon extends Weapon {

    private int weaponUses;

    public RangedWeapon(String name, int weaponDamage, int weaponUses) {
        super(name, weaponDamage);
        this.weaponUses = weaponUses;
    }
}
