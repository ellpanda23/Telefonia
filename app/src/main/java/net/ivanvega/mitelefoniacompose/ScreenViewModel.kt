package net.ivanvega.mitelefoniacompose

import android.telephony.SmsManager
import androidx.lifecycle.ViewModel

class ScreenViewModel: ViewModel() {

    fun sendSMS(){
        val smsManage = SmsManager.getDefault()
        smsManage.sendTextMessage("4451234567",
            null,
            "CUerpo del mensahe de texto",null,null
            )

    }

}