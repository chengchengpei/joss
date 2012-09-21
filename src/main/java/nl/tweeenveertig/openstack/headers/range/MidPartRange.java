package nl.tweeenveertig.openstack.headers.range;

/**
 * Take the object starting at 'offset' with a length equal to 'length'
 */
public class MidPartRange extends AbstractRange {

    public MidPartRange(long offset, long length) {
        super(offset, length);
    }
}