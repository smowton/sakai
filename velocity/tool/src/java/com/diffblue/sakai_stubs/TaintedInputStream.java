
package com.diffblue.sakai_stubs;

import java.io.InputStream;

public class TaintedInputStream extends InputStream {

    public int read() { return TaintSource.get_tainted_int(); }

}
				       
