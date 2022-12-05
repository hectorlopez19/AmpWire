package themes;

import com.formdev.flatlaf.FlatDarkLaf;

public class AmpWireDark extends FlatDarkLaf {
	public static final String NAME = "AmpWireDark";

	public static boolean setup() {
		return setup( new AmpWireDark() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, AmpWireDark.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
