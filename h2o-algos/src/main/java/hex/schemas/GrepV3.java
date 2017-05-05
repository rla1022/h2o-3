package hex.schemas;

import com.google.auto.service.AutoService;
import hex.grep.Grep;
import hex.grep.GrepModel;
import water.api.API;
import water.api.Schema;
import water.api.schemas3.ModelParametersSchemaV3;

@AutoService(Schema.class)
public class GrepV3 extends ModelBuilderSchema<Grep,GrepV3,GrepV3.GrepParametersV3> {

  @AutoService(Schema.class)
  public static final class GrepParametersV3 extends ModelParametersSchemaV3<GrepModel.GrepParameters, GrepParametersV3> {
    static public String[] own_fields = new String[] { "regex" };

    // Input fields
    @API(help="regex")  public String regex;
  } // GrepParametersV2
}
