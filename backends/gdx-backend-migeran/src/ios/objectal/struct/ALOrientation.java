package ios.objectal.struct;


import com.migeran.natj.c.StructObject;
import com.migeran.natj.c.ann.Structure;
import com.migeran.natj.c.ann.StructureField;
import com.migeran.natj.general.NatJ;
import com.migeran.natj.general.Pointer;
import com.migeran.natj.general.ann.ByValue;
import com.migeran.natj.general.ann.Generated;

@Generated
@Structure()
public final class ALOrientation extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ALOrientation() {
		super(ALOrientation.class);
	}

	@Generated
	protected ALOrientation(Pointer peer) {
		super(peer);
	}

	@Generated
	public ALOrientation(@ByValue ALVector at, @ByValue ALVector up) {
		super(ALOrientation.class);
		setAt(at);
		setUp(up);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native ALVector at();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAt(@ByValue ALVector value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native ALVector up();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setUp(@ByValue ALVector value);
}