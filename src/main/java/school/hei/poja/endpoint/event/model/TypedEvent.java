package school.hei.poja.endpoint.event.model;

import java.io.Serializable;
import school.hei.poja.PojaGenerated;

/**
 * Event models generated by EventBridge are NOT typed, unfortunately. TypedEvent takes care of
 * that.
 */
@PojaGenerated
public interface TypedEvent {
  String getTypeName();

  Serializable getPayload();
}
