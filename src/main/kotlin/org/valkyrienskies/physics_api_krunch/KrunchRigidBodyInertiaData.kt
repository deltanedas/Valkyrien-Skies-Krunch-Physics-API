package org.valkyrienskies.physics_api_krunch

import org.joml.Vector3d
import org.valkyrienskies.physics_api.RigidBodyInertiaData

internal data class KrunchRigidBodyInertiaData(override var mass: Double, override var momentOfInertia: Vector3d) :
    RigidBodyInertiaData
