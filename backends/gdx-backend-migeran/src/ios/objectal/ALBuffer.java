package ios.objectal;


import com.migeran.natj.general.NatJ;
import com.migeran.natj.general.Pointer;
import com.migeran.natj.general.ann.Generated;
import com.migeran.natj.general.ann.Owned;
import com.migeran.natj.general.ann.Runtime;
import com.migeran.natj.general.ptr.VoidPtr;
import com.migeran.natj.objc.ObjCRuntime;
import com.migeran.natj.objc.ann.ObjCClassBinding;
import com.migeran.natj.objc.ann.Selector;
import ios.NSObject;
import java.lang.String;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ALBuffer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected ALBuffer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native ALBuffer alloc();

	@Generated
	@Selector("bits")
	public native int bits();

	@Generated
	@Selector("bufferId")
	public native int bufferId();

	@Generated
	@Selector("bufferWithName:data:size:format:frequency:")
	public static native ALBuffer bufferWithNameDataSizeFormatFrequency(
			String name, VoidPtr data, int size, int format, int frequency);

	@Generated
	@Selector("channels")
	public native int channels();

	@Generated
	@Selector("duration")
	public native float duration();

	@Generated
	@Selector("format")
	public native int format();

	@Generated
	@Selector("freeDataOnDestroy")
	public native boolean freeDataOnDestroy();

	@Generated
	@Selector("frequency")
	public native int frequency();

	@Generated
	@Selector("init")
	public native ALBuffer init();

	@Generated
	@Selector("initWithName:data:size:format:frequency:")
	public native ALBuffer initWithNameDataSizeFormatFrequency(String name,
			VoidPtr data, int size, int format, int frequency);

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("parentBuffer")
	public native ALBuffer parentBuffer();

	@Generated
	@Selector("setFreeDataOnDestroy:")
	public native void setFreeDataOnDestroy(boolean value);

	@Generated
	@Selector("setName:")
	public native void setName(String value);

	@Generated
	@Selector("setParentBuffer:")
	public native void setParentBuffer(ALBuffer value);

	@Generated
	@Selector("size")
	public native int size();

	@Generated
	@Selector("sliceWithName:offset:size:")
	public native ALBuffer sliceWithNameOffsetSize(String sliceName,
			int offset, int size);
}