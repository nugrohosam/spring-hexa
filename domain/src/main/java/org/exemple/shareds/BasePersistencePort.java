package org.exemple.shareds;

import java.util.List;

public interface BasePersistencePort<DTO> {

    DTO add(DTO dto);

    void deleteById(Long id);

    DTO update(DTO dto);

    List<DTO> get();

    DTO getById(Long bookId);

}
