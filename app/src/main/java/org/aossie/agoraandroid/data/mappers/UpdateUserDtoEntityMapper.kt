package org.aossie.agoraandroid.data.mappers

import org.aossie.agoraandroid.data.network.dto.UpdateUserDto
import org.aossie.agoraandroid.domain.model.UpdateUserDtoModel
<<<<<<< HEAD
import javax.inject.Inject

class UpdateUserDtoEntityMapper @Inject constructor() {
  fun mapToEntity(domainModel: UpdateUserDtoModel): UpdateUserDto {
    return UpdateUserDto(
      identifier = domainModel.identifier,
      email = domainModel.email,
      firstName = domainModel.firstName,
      lastName = domainModel.lastName,
      trustedDevice = domainModel.trustedDevice,
      twoFactorAuthentication = domainModel.twoFactorAuthentication,
      avatarURL = domainModel.avatarURL,
      authToken = domainModel.authToken,
      refreshToken = domainModel.refreshToken
    )
  }
}
=======
import org.aossie.agoraandroid.utilities.EntityMapper

class UpdateUserDtoEntityMapper : EntityMapper<UpdateUserDto , UpdateUserDtoModel> {
  override fun mapFromEntity(entity: UpdateUserDto): UpdateUserDtoModel {
    TODO("Not yet implemented")
  }

  override fun mapToEntity(domainModel: UpdateUserDtoModel): UpdateUserDto {
     return UpdateUserDto(
       identifier = domainModel.identifier,
       email = domainModel.email,
       firstName = domainModel.firstName,
       lastName = domainModel.lastName,
       trustedDevice = domainModel.trustedDevice,
       twoFactorAuthentication = domainModel.twoFactorAuthentication,
       avatarURL = domainModel.avatarURL,
       authToken = domainModel.authToken,
       refreshToken = domainModel.refreshToken
     )
  }
}
>>>>>>> 53e2ff0 (profile fragment clean architecture use cases and implementation)
