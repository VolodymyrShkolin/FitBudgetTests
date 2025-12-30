package constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Kekv {

    private Kekv() {
        throw new AssertionError("Cannot instantiate constants class");
    }

    public static final List<String> KEKV = Collections.unmodifiableList(
            Arrays.asList("2800", "2120", "2111", "2112", "2210", "2260", "2271", "2276",
                    "2281", "2282", "2410", "2420", "2610", "2630", "2710", "2730",
                    "3110", "3160", "3210", "3240", "4111", "4113", "4121", "4123",
                    "4210", "4220")
    );

    public static final List<String> RESTRICT_KEKV = Collections.unmodifiableList(
            Arrays.asList("2111", "2112", "2120", "2220", "2230", "2271", "2272", "2273", "2274",
                    "2275", "2276", "2281", "2282", "2710", "2720", "2730")
    );

    public static final List<String> KEKV_EXTENDED_2110 = Collections.unmodifiableList(
            Arrays.asList("2111", "2112")
    );

    public static final List<String> KEKV_EXTENDED_2270 = Collections.unmodifiableList(
            Arrays.asList("2271", "2272", "2273", "2274", "2275", "2276")
    );

    public static final List<String> KEKV_EXTENDED_2700 = Collections.unmodifiableList(
            Arrays.asList("2710", "2720", "2730")
    );

    public static final List<String> KEKV_EXTENDED_5000 = Collections.unmodifiableList(
            Arrays.asList("2210", "2240", "2250", "2260", "2410", "2420", "2610", "2620",
                    "2630", "2800", "3110", "3121", "3122", "3131", "3132", "3141",
                    "3142", "3143", "3150", "3160", "3210", "3220", "3230", "3240",
                    "4111", "4112", "4113", "4121", "4122", "4123", "4210", "4220")
    );

    public static final List<String> KEKV_EXTENDED_2000 = Collections.unmodifiableList(
            Arrays.asList("2100", "2200", "2400", "2600", "2700", "2800")
    );

    public static final List<String> KEKV_EXTENDED_2100 = Collections.unmodifiableList(
            Arrays.asList("2111", "2112", "2120")
    );

    public static final List<String> KEKV_EXTENDED_2200 = Collections.unmodifiableList(
            Arrays.asList("2210", "2220", "2230", "2240", "2250", "2260", "2271", "2272",
                    "2273", "2274", "2275", "2276", "2281", "2282")
    );

    public static final List<String> KEKV_EXTENDED_2400 = Collections.unmodifiableList(
            Arrays.asList("2410", "2420")
    );

    public static final List<String> KEKV_EXTENDED_2600 = Collections.unmodifiableList(
            Arrays.asList("2610", "2620", "2630")
    );

    public static final List<String> KEKV_EXTENDED_2800 = (
            List.of("2800")
    );

    public static final List<String> KEKV_EXTENDED_3000 = Collections.unmodifiableList(
            Arrays.asList("3110", "3121", "3122", "3131", "3132", "3141", "3142", "3143",
                    "3150", "3160", "3210", "3220", "3230", "3240")
    );

    public static final List<String> KEKV_EXTENDED_4000 = Collections.unmodifiableList(
            Arrays.asList("4111", "4112", "4113", "4121", "4122", "4123", "4210", "4220")
    );
}
