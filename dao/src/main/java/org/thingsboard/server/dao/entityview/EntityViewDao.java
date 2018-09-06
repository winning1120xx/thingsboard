/**
 * Copyright © 2016-2018 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.dao.entityview;

import org.thingsboard.server.common.data.EntityView;
import org.thingsboard.server.common.data.id.EntityId;
import org.thingsboard.server.common.data.page.TextPageLink;
import org.thingsboard.server.dao.Dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by Victor Basanets on 8/28/2017.
 */
public interface EntityViewDao extends Dao<EntityView> {

    /**
     * Find entity views by tenantId and page link.
     *
     * @param tenantId the tenantId
     * @param pageLink the page link
     * @return the list of entity view objects
     */
    List<EntityView> findEntityViewByTenantId(UUID tenantId, TextPageLink pageLink);

    /**
     * Find entity views by tenantId and entity view name.
     *
     * @param tenantId the tenantId
     * @param name the entity view name
     * @return the optional entity view object
     */
    Optional<EntityView> findEntityViewByTenantIdAndName(UUID tenantId, String name);

    /**
     * Find entity views by tenantId, entityId and page link.
     *
     * @param tenantId the tenantId
     * @param entityId the entityId
     * @param pageLink the page link
     * @return the list of entity view objects
     */
    List<EntityView> findEntityViewByTenantIdAndEntityId(UUID tenantId,
                                                         UUID entityId,
                                                         TextPageLink pageLink);

    /**
     * Find entity views by tenantId, customerId and page link.
     *
     * @param tenantId the tenantId
     * @param customerId the customerId
     * @param pageLink the page link
     * @return the list of entity view objects
     */
    List<EntityView> findEntityViewsByTenantIdAndCustomerId(UUID tenantId,
                                                            UUID customerId,
                                                            TextPageLink pageLink);

    /**
     * Find entity views by tenantId, customerId, entityId and page link.
     *
     * @param tenantId the tenantId
     * @param customerId the customerId
     * @param entityId the entityId
     * @param pageLink the page link
     * @return the list of entity view objects
     */
    List<EntityView> findEntityViewsByTenantIdAndCustomerIdAndEntityId(UUID tenantId,
                                                                       UUID customerId,
                                                                       UUID entityId,
                                                                       TextPageLink pageLink);

}