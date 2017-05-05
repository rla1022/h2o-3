package water.api;

import com.google.auto.service.AutoService;
import hex.pca.ModelMetricsPCA;
import water.api.schemas3.ModelMetricsBaseV3;
@AutoService(Schema.class)
public class ModelMetricsPCAV3 extends ModelMetricsBaseV3<ModelMetricsPCA, ModelMetricsPCAV3> {
  // Empty since PCA has no model metrics
}
