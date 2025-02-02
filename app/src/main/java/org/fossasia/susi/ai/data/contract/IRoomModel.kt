package org.fossasia.susi.ai.data.contract

import org.fossasia.susi.ai.dataclasses.AddDeviceQuery
import org.fossasia.susi.ai.rest.responses.susi.ConnectedDevicesResponse
import retrofit2.Response

interface IRoomModel {

    interface onConnectedDeviceFetchingFinishedListener {
        fun onRoomModelSuccess(response: Response<ConnectedDevicesResponse>)
        fun onError(throwable: Throwable)
    }

    fun addDeviceToServer(query: AddDeviceQuery)
    fun getConnectedDevices(listener: onConnectedDeviceFetchingFinishedListener)
}