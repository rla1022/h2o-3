package hex.schemas;

import com.google.auto.service.AutoService;
import hex.example.Example;
import hex.example.ExampleModel;
import water.api.API;
import water.api.Schema;
import water.api.schemas3.ModelParametersSchemaV3;

@AutoService(Schema.class)
public class ExampleV3 extends ModelBuilderSchema<Example,ExampleV3,ExampleV3.ExampleParametersV3> {

  @AutoService(Schema.class)
  public static final class ExampleParametersV3 extends ModelParametersSchemaV3<ExampleModel.ExampleParameters, ExampleParametersV3> {
    static public String[] own_fields = new String[] { "training_frame","ignored_columns","max_iterations"};

    // Input fields
    @API(help="Maximum training iterations.")  public int max_iterations;
  } // ExampleParametersV2
}
