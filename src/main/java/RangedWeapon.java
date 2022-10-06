abstract class RangedWeapon extends Weapon {

    private int weaponUses;

    public RangedWeapon(String name, int weaponDamage, int weaponUses) {
        super(name, weaponDamage);
        this.weaponUses = weaponUses;
    }

    public int getWeaponUses() {
        return weaponUses;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Weapon damage: " + getWeaponDamage() + ", " + "Weapon user ammo: " + weaponUses;
    }
}
