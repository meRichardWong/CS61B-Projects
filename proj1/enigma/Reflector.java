package enigma;

import static enigma.EnigmaException.*;

/** Class that represents a reflector in the enigma.
 *  @author rw
 */
class Reflector extends FixedRotor {

    /** A non-moving rotor named NAME whose permutation at the 0 setting
     * is PERM. */
    Reflector(String name, Permutation perm, String notches) {
        super(name, perm, notches);
    }

    /** Return true iff I reflect. */
    boolean reflecting() {
        return true;
    }

    @Override
    int convertForward(int p) {
        return  _permutation.permute(p);
    }

    @Override
    void set(int posn) {
        if (posn != 0) {
            throw error("reflector has only one position");
        }
    }

}
