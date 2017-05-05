package water.api;

import com.google.auto.service.AutoService;
import hex.svd.SVDModel.ModelMetricsSVD;
import water.api.schemas3.ModelMetricsBaseV3;

@AutoService(Schema.class)
public class ModelMetricsSVDV99 extends ModelMetricsBaseV3<ModelMetricsSVD, ModelMetricsSVDV99> {
  // Empty since SVD has no model metrics
}
