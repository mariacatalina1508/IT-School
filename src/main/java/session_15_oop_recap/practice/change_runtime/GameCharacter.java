package session_15_oop_recap.practice.change_runtime;

public class GameCharacter {

    private Weapon weapon;

    public GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attack() {
        weapon.use();
    }
}